package com.example.hiringmanagment.Service.ServiceIterface;

import com.example.hiringmanagment.Entitiy.Offre;

public interface Agent {
    boolean login(Agent agent);
    boolean valide(Offre offre);
    boolean refuse(Offre offre);


}
