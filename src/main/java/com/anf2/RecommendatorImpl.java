package com.anf2;

/**
 * @author Stepan Anfi
 * 3/9/2023
 */

@Singleton
@Deprecated
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("wisky")
    private String alcohol;

    public RecommendatorImpl() {
        System.out.println("RecommendatorImpl was created");
    }
    @Override
    public void recommend() {
        System.out.println("to protect from covid, drink " + alcohol);
    }
}
