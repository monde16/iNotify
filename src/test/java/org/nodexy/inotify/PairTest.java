package org.nodexy.inotify;

import junit.framework.TestCase;
import org.nodexy.inotify.struct.Pair;

/**
 * Created by phoenix on 11/3/16.
 */
public class PairTest extends TestCase {
    Integer k;
    String v;
    Pair<Integer,String> pair;

    @Override
    protected void setUp() {
        k=23;
        v="twenty three";
    }

    public void testCtor() {
        pair = new Pair<>(k,v);
        System.out.println("pair: "+pair);
        assertTrue(pair.getKey().equals(k));
        assertTrue(pair.getValue().equals(v));
    }

    public void testSetters() {
        pair = new Pair<>();
        System.out.println("pair: "+pair);
        assertTrue(pair.getKey()==null);
        assertTrue(pair.getValue()==null);

        pair.setKey(k);
        pair.setValue(v);
        System.out.println("pair: "+pair);
        assertTrue(pair.getKey().equals(k));
        assertTrue(pair.getValue().equals(v));
    }
}
