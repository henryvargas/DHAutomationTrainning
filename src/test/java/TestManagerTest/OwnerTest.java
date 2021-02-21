package TestManagerTest;

import TestManager.Owner;
import TestManager.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class OwnerTest {

    @Test
    public void VerifyThatOwnerIsCreatedWithFirstName() {
        Owner owner = new Owner("Henry");
        Assert.assertEquals(owner.getFirstName(), "Henry");

        }

    @Test
    public void VerifyThatOwnerIsCreatedWithLastName() {
        Owner owner = new Owner("Henry");
        owner.setLastName("Vargas");
        Assert.assertEquals(owner.getLastName(), "Vargas");
    }
    @Test
    public void VerifyThatOwnerIsCreatedWithRole() {
        Owner owner = new Owner("Henry");
        owner.setRole("Lead");
        Assert.assertEquals(owner.getRole(), "Lead");
    }
}
