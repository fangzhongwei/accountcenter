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

public final class DepositRequestResponseHolder extends Ice.ObjectHolderBase<DepositRequestResponse>
{
    public
    DepositRequestResponseHolder()
    {
    }

    public
    DepositRequestResponseHolder(DepositRequestResponse value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof DepositRequestResponse)
        {
            value = (DepositRequestResponse)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return DepositRequestResponse.ice_staticId();
    }
}
