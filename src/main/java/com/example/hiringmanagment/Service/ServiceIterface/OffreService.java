package com.example.hiringmanagment.Service.ServiceIterface;

import com.example.hiringmanagment.Entitiy.Offre;

import java.util.List;

public interface OffreService {

    List<Offre> fetch();
    Offre create(Offre offre);
    Offre update(Offre offre);
    Offre delete(Offre offre);

}
