package Parcial1FilaA.Pegunta1;

public class Client {
public static void main(String[]args){


    Conductor conductor1= new Conductor();

    conductor1.pagarPeaje(20,new Vehiculo("2342Alc","Honda civic","10.000km"));

    conductor1.pagarPeaje(20,new Vehiculo("54545fuj","Renault duster","60.000km"));


    Administrador admin= new Administrador();

    admin.obtenerSaldoCaseta();
    admin.numeroDeVehiculos();
}
}
