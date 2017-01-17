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

public class SettleRequest extends Ice.ObjectImpl
{
    public SettleRequest()
    {
    }

    public SettleRequest(long gameId, long memberId1, int amount1, long memberId2, int amount2, long memberId3, int amount3)
    {
        this.gameId = gameId;
        this.memberId1 = memberId1;
        this.amount1 = amount1;
        this.memberId2 = memberId2;
        this.amount2 = amount2;
        this.memberId3 = memberId3;
        this.amount3 = amount3;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new SettleRequest();
        }

        public void destroy()
        {
        }
    }
    private static Ice.ObjectFactory _factory = new __F();

    public static Ice.ObjectFactory
    ice_factory()
    {
        return _factory;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::RpcAccount::SettleRequest"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.writeLong(gameId);
        __os.writeLong(memberId1);
        __os.writeInt(amount1);
        __os.writeLong(memberId2);
        __os.writeInt(amount2);
        __os.writeLong(memberId3);
        __os.writeInt(amount3);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        gameId = __is.readLong();
        memberId1 = __is.readLong();
        amount1 = __is.readInt();
        memberId2 = __is.readLong();
        amount2 = __is.readInt();
        memberId3 = __is.readLong();
        amount3 = __is.readInt();
        __is.endReadSlice();
    }

    public long gameId;

    public long memberId1;

    public int amount1;

    public long memberId2;

    public int amount2;

    public long memberId3;

    public int amount3;

    public SettleRequest
    clone()
    {
        return (SettleRequest)super.clone();
    }

    public static final long serialVersionUID = 5507623321983448042L;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SettleRequest{");
        sb.append("gameId=").append(gameId);
        sb.append(", memberId1=").append(memberId1);
        sb.append(", amount1=").append(amount1);
        sb.append(", memberId2=").append(memberId2);
        sb.append(", amount2=").append(amount2);
        sb.append(", memberId3=").append(memberId3);
        sb.append(", amount3=").append(amount3);
        sb.append('}');
        return sb.toString();
    }
}
