package hu.bme.aut.animalfacts;


import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.animalfacts.network.NetworkModule;
import hu.bme.aut.animalfacts.ui.UIModule;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class})
public interface AnimalFactsApplicationComponent {
}
