public interface IBaseRate {

    // Write a method the returns a base rate
    default double getBaseRate() {
        return 2.5;
    }
}