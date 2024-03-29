package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  Clase concreta de un robot para este proyecto
 *
 *  Aqui implementamos el patron de diseño State para modelar
 *  los distintos cambios de estado que nuestro robot experimentará a lo largo
 *  del programa.
 *
 *  Para esto, todas las acciones posibles que pueda realizar el robot
 *  son designadas a su estado interno. (vease StateRobot estado)
 *
 *  Empieza en su estado inicial que es encendido.
 *  */
public class Robot implements StateRobot{

    StateRobot estado;

    public Robot(){
        this.estado = new StateRobotEncendido(this);
    }

    @Override
    public void suspender() {
        estado.suspender();
    }

    @Override
    public void activar() {
        estado.activar();
    }

    @Override
    public void tomarOrden(MenuGlobal menuGlobal) {
        estado.tomarOrden(menuGlobal);
    }

    @Override
    public void cocinar(MenuItem hamburguesa) {
        estado.cocinar(hamburguesa);

    }

    @Override
    public void interactuarCliente() {
        estado.interactuarCliente();

    }


}
