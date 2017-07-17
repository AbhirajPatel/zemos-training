package cycleFactory;

import cycles.Cycle;

/**
 * Created by zemoso on 12/7/17.
 */
public interface CycleFactory extends Bicyclefactory, Unicyclefactory, Tricyclefactory {
    Cycle getcycle();
}
