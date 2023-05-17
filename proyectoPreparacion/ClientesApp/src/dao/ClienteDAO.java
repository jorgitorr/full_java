package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO {
    private String archivo = "src/clientes.txt";


    public List<Cliente> obtieneClientes(){
        List<Cliente>clientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String cadena;
            while((cadena=br.readLine())!=null){
                String[]datos = cadena.split(";");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String apellido = datos[2];
                String pais = datos[3];
                Cliente cliente = new Cliente(id,nombre,apellido);
                cliente.setPais(pais);
                clientes.add(cliente);
            }
        } catch(FileNotFoundException ex){
            System.err.println("Fichero no encontrado");
        }catch (IOException e) {
            System.err.println("Error E/S");
        }
        return clientes;
    }

    public Cliente getClienteById(int id){
        Cliente cliente = null;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String cadena;
            while((cadena=br.readLine())!=null){
                String[]datos = cadena.split(";");
                int idDato = Integer.parseInt(datos[0]);
                if(idDato == id){
                    String nombre = datos[1];
                    String apellido = datos[2];
                    String pais = datos[3];
                    cliente = new Cliente(idDato, nombre, apellido);
                    cliente.setPais(pais);
                }
            }
        } catch(FileNotFoundException ex){
            System.err.println("Fichero no encontrado");
        }catch (IOException e) {
            System.err.println("Error de E/S");
        }
        return cliente;
    }

    public void insertarCliente(Cliente cliente){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true))) {
            String linea = "\n"+cliente.getId() + ";" + cliente.getNombre() + ";" + cliente.getApellido() + ";" + cliente.getPais();
            bw.write(linea);
        } catch(FileNotFoundException ex){
            System.err.println("Error al leer el fichero");
        }catch (IOException e) {
            System.err.println("Error de E/S");
        }
    }

    //tiene un error que cada vez que sale del programa al haber borrado
    //borra todo
    public void borrarCliente(Cliente cliente){
        List<Cliente>clientesTemporal = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            String cadena;
            while((cadena=br.readLine())!=null){
                String[]datos = cadena.split(";");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String apellido = datos[2];
                String pais = datos[3];
                Cliente c = new Cliente(id, nombre, apellido);
                c.setPais(pais);
                if(!c.equals(cliente)){
                    String linea = id + ";" + nombre + ";" + apellido + ";" + pais + "/n";
                    bw.write(linea);
                }
            }
        } catch(FileNotFoundException ex){
            System.err.println("Error de fichero");
        }catch (IOException e) {
            System.err.println("Error de E/S");
        }
        
    }
}
