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

public class DiamondAccountResponse extends AccountBaseResponse
{
    public DiamondAccountResponse()
    {
        super();
    }

    public DiamondAccountResponse(String code, long accountId, long memberId, int amount, long gmtCreate, long gmtUpdate)
    {
        super(code);
        this.accountId = accountId;
        this.memberId = memberId;
        this.amount = amount;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new DiamondAccountResponse();
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
        "::RpcAccount::AccountBaseResponse",
        "::RpcAccount::DiamondAccountResponse"
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
        return __ids[2];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[2];
    }

    public static String ice_staticId()
    {
        return __ids[2];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, false);
        __os.writeLong(accountId);
        __os.writeLong(memberId);
        __os.writeInt(amount);
        __os.writeLong(gmtCreate);
        __os.writeLong(gmtUpdate);
        __os.endWriteSlice();
        super.__writeImpl(__os);
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        accountId = __is.readLong();
        memberId = __is.readLong();
        amount = __is.readInt();
        gmtCreate = __is.readLong();
        gmtUpdate = __is.readLong();
        __is.endReadSlice();
        super.__readImpl(__is);
    }

    public long accountId;

    public long memberId;

    public int amount;

    public long gmtCreate;

    public long gmtUpdate;

    public DiamondAccountResponse
    clone()
    {
        return (DiamondAccountResponse)super.clone();
    }

    public static final long serialVersionUID = 8975759516342529391L;
}
