package org.example.service;
import org.example.entities.Cloud;
import org.example.repository.CloudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CloudService {
    @Autowired
    private CloudRepository cloudRepository;

    public List<Cloud> getAll(){
        return cloudRepository.getAll();
    }
    public Optional<Cloud> getProduct(int id){
        return cloudRepository.getCloud(id);
    }
    public Cloud save(Cloud p){
        if(p.getIdCloud()==null){
            return cloudRepository.save(p);
        }else{
            Optional<Cloud> e = cloudRepository.getCloud(p.getIdCloud());
            if(e.isPresent()){

                return p;
            }else{
                return cloudRepository.save(p);
            }
        }
    }
    public Cloud update(Cloud p){
        if(p.getIdCloud()!=null){
            Optional<Cloud> q = cloudRepository.getCloud(p.getIdCloud());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                cloudRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Cloud>p= cloudRepository.getCloud(id);
        if(p.isPresent()){
            cloudRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}

