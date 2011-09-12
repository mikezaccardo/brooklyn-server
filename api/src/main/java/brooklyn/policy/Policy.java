package brooklyn.policy;

/**
 * Policies implement actions and thus must be suspendable; policies should continue to evaluate their sensors
 * and indicate their desired planned action even if they aren't invoking them
 */
public interface Policy extends EntityAdjunct {
   /**
     * A unique id for this policy.
     */
    String getId();

    /**
     * Get the name assigned to this policy.
     *
     * @return the name assigned to the policy.
     */
    String getName();
    /**
     * resume the policy
     */
    void resume();

    void destroy();

    Boolean isDestroyed();

    /**
     * suspend the policy
     */
    void suspend();
    
    /**
     * whether the policy is suspended
     */
    Boolean isSuspended();
}
