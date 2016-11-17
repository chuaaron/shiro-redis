package org.crazycake.shiro;

import org.apache.shiro.util.SimpleByteSource;

import java.io.Serializable;

/**
 * Created by sunb-c on 2016/11/17.
 */
public class SerializableSimpleByteSource extends SimpleByteSource implements Serializable{

    private static final long serialVersionUID = 1L;

    public SerializableSimpleByteSource(byte[] bytes) {
        super(bytes);
    }

    public SerializableSimpleByteSource(String credentialsSalt) {
        super(credentialsSalt);
    }
}
