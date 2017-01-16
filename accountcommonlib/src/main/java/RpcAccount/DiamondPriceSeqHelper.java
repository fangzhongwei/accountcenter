// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `account.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RpcAccount;

public final class DiamondPriceSeqHelper
{
    public static void
    write(IceInternal.BasicStream __os, DiamondPrice[] __v)
    {
        if(__v == null)
        {
            __os.writeSize(0);
        }
        else
        {
            __os.writeSize(__v.length);
            for(int __i0 = 0; __i0 < __v.length; __i0++)
            {
                __os.writeObject(__v[__i0]);
            }
        }
    }

    public static DiamondPrice[]
    read(IceInternal.BasicStream __is)
    {
        DiamondPrice[] __v;
        final int __len0 = __is.readAndCheckSeqSize(1);
        final String __type0 = DiamondPrice.ice_staticId();
        __v = new DiamondPrice[__len0];
        for(int __i0 = 0; __i0 < __len0; __i0++)
        {
            __is.readObject(new IceInternal.SequencePatcher(__v, DiamondPrice.class, __type0, __i0));
        }
        return __v;
    }
}
