public class Main {
        public static void main(String[] args) {


//        CuentaBancaria cuenta1 = new CuentaBancaria();
//        cuenta1.setNumeroCuenta("12345");
//        cuenta1.setNombreTitular("Camila");
//        cuenta1.setTipoCuenta("Ahorros");
//
//        // Crear cuenta usando constructor con parámetros
//        CuentaBancaria cuenta2 = new CuentaBancaria("98765", "Lizeth", "Corriente", 0);
//
//        // Operaciones sobre cuenta1
//        cuenta1.depositar(150000);
//        cuenta1.retirarDinero(200000);
//        cuenta1.depositar(-100000);
//        cuenta1.retirarDinero(120000);
//
//        // Operaciones sobre cuenta2
//        cuenta2.depositar(100000);
//        cuenta2.retirarDinero(150000);
//        cuenta2.retirarDinero(-100000); // inválido
//        System.out.println();
//        // Mostrar datos
//        System.out.println("--- Cuenta 1 ---");
//        cuenta1.mostrarDatos();
//        System.out.println();
//        System.out.println("--- Cuenta 2 ---");
//        cuenta2.mostrarDatos();
//    }
//}
//---------------------------------------------------------------------------------------------------------/////////

//// Crear un libro
//Libro libro1 = new Libro("El nombre de la rosa", "Umberto Eco", 1980);
//
//// Mostrar detalles iniciales
//        System.out.println("--- Estado inicial ---");
//        libro1.mostrarDetalles();
//
//// Intentar prestarlo dos veces
//        System.out.println("\n--- Primer intento de préstamo ---");
//        libro1.prestar();
//        libro1.mostrarDetalles();
//
//        System.out.println("\n--- Segundo intento de préstamo ---");
//        libro1.prestar();
//        libro1.mostrarDetalles();
//
//// Devolver el libro
//        System.out.println("\n--- Devolviendo el libro ---");
//        libro1.devolver();
//        libro1.mostrarDetalles();
//
//// Intentar prestarlo nuevamente
//        System.out.println("\n--- Nuevo intento de préstamo ---");
//        libro1.prestar();
//        libro1.mostrarDetalles();
//    }
//            }
//
//----------------------------------------------------------------------------------//

                                // Coche con constructor vacío
                                Coche coche1 = new Coche();
                                coche1.setMarca("Toyota");
                                coche1.setModelo("Corolla");
                                coche1.setAnio(2020);

                                // Coche con constructor parametrizado
                                Coche coche2 = new Coche("Honda", "Civic", 2019, 35000);

                                // Actualizar kilometraje coche1
                                System.out.println("\n-- Actualizando kilometraje de coche1 --");
                                coche1.actualizarKilometraje(1500); // válido
                                coche1.actualizarKilometraje(-300); // inválido

                                // Mostrar información
                                System.out.println("\n-- Información básica coche1 --");
                                coche1.mostrarInformacion();

                                System.out.println("\n-- Información detallada coche1 --");
                                coche1.mostrarInformacion(true);

                                System.out.println("\n-- Información detallada coche2 --");
                                coche2.mostrarInformacion(true);
                        }
                }






