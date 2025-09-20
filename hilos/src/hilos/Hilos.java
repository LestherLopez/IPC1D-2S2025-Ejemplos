/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author Lesther
 */
public class Hilos {


    
    
     static class Pokemon implements Runnable {
        private String nombre;
        private int hp;
        private Pokemon oponente;
        
        public Pokemon(String nombre, int hp) {
            this.nombre = nombre;
            this.hp = hp;
        }

        public String getNombre() {
            return nombre;
        }
        
        public void setOponente(Pokemon oponente) {
            this.oponente = oponente;
        }

        @Override
        public void run() {
            try {
                while (hp > 0 && oponente.hp > 0) {
                    // daño fijo entre 5 y 10
                    int dano = (int)(Math.random() * 6) + 5;
                    oponente.hp -= dano;
                    // max devuelve el numero mas grande entre dos.
                    System.out.println(nombre + " ataca a " + oponente.nombre +
                                       " causando " + dano + " de daño. " +
                                       "HP de " + oponente.nombre + ": " + Math.max(oponente.hp, 0));

                    // esperar un segundo antes del próximo ataque
                    Thread.sleep(1000);
                }

                if (oponente.hp <= 0) {
                    System.out.println("Ataque:" + nombre + " ha ganado la batalla!");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 50);
        Pokemon charmander = new Pokemon("Charmander", 50);

        pikachu.setOponente(charmander);
        charmander.setOponente(pikachu);
       
        Thread t1 = new Thread(pikachu);
        Thread t2 = new Thread(charmander);

        t1.start();
        t2.start();
    }
    
}
