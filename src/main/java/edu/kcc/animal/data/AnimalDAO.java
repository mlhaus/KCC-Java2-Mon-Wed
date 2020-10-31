/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal.data;

import edu.kcc.animal.Animal;
import java.util.ArrayList;

/**
 *
 * @author spark
 */
public interface AnimalDAO {
    
    /*
    * Creates a new Animal record based on the values supplied in Animal.
    *
    * @param animal the Animal object with recorded values
    * @throws AnimalDataException
    */
    void createAnimal(Animal animal)
            throws AnimalDataException;
    
    /*
    * Returns the Animal record associated with the animalName or null if there
    * is no such animal record
    *
    * @param animalName the identifier of the desired Animal record
    * @return the associated Animal or null if not found
    * @throws AnimalDataException
    */
    Animal getAnimalByAnimalName(String animalName)
            throws AnimalDataException;
    
    /*
    * Returns a list of all the current Animal records.
    *
    * @return list of Animal records
    * @throws AnimalDataException
    */
    ArrayList<Animal> getAllAnimals() 
            throws AnimalDateException;
    
    /*
    * Looks for the original Animal and updates it to match the updated Animal.
    * If the original Animal cannot be found, the method will throw an exception.
    *
    * @param original The Animal record to be updated
    * @param updated The Animal containing the updated values
    * @throw AnimalDataException
    */
    void updateAnimal(Animal original, Animal updated)
            throws AnimalDataException;
    
    /*
    * Permanently deletes the supplied Animal record.
    *
    * @param animal the Animal to delete
    * @throws AnimalDataException
    */
    void deleteAnimal(Animal animal)
            throws AnimalDataException;
    
    /*
    * Permentantly deletes the Animal record with the supplied animalName value.
    *
    * @param animalName the unique identifier for the Animal to be deleted
    * @throws AnimalDataException
    */
    void deleteAnimal(String animalName) 
            throws AnimalDataException;
            
    
}
