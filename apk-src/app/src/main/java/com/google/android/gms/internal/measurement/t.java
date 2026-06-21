package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13968b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f13967a = obj;
        this.f13968b = obj2;
    }

    public Object a() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        i4 i4Var = (i4) this.f13967a;
        String str = (String) this.f13968b;
        Context context = (Context) i4Var.f13782c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        m.h3 h3Var = z3.f14113a;
        if (contentResolver == null) {
            h3Var.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (h3Var) {
            try {
                if (((HashMap) h3Var.f28251c) == null) {
                    ((AtomicBoolean) h3Var.f28250b).set(false);
                    h3Var.f28251c = new HashMap(16, 1.0f);
                    h3Var.f28256h = new Object();
                    contentResolver.registerContentObserver(a4.f13649a, true, new com.google.android.gms.internal.auth.i(h3Var));
                } else if (((AtomicBoolean) h3Var.f28250b).getAndSet(false)) {
                    ((HashMap) h3Var.f28251c).clear();
                    ((HashMap) h3Var.f28252d).clear();
                    ((HashMap) h3Var.f28253e).clear();
                    ((HashMap) h3Var.f28254f).clear();
                    ((HashMap) h3Var.f28255g).clear();
                    h3Var.f28256h = new Object();
                }
                Object obj = h3Var.f28256h;
                String str2 = null;
                if (((HashMap) h3Var.f28251c).containsKey(str)) {
                    String str3 = (String) ((HashMap) h3Var.f28251c).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = a4.f13649a;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                    } finally {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                } catch (c4 unused) {
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new c4("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new c4("ContentProvider query returned null cursor");
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(1);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (h3Var) {
                            try {
                                if (obj == h3Var.f28256h) {
                                    ((HashMap) h3Var.f28251c).put(str, string);
                                }
                            } finally {
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } finally {
                    }
                } catch (RemoteException e3) {
                    throw new c4("ContentProvider query failed", e3);
                }
            } finally {
            }
        }
    }

    public void b(s sVar) {
        Iterator it = sVar.f13950a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f13967a).put(Integer.valueOf(((w) it.next()).f14069b).toString(), sVar);
        }
    }

    public n c(com.google.firebase.messaging.y yVar, n nVar) {
        rl.b.J(yVar);
        if (!(nVar instanceof o)) {
            return nVar;
        }
        o oVar = (o) nVar;
        ArrayList arrayList = oVar.f13900c;
        String str = oVar.f13899b;
        HashMap map = (HashMap) this.f13967a;
        return (map.containsKey(str) ? (s) map.get(str) : (s) this.f13968b).a(str, yVar, arrayList);
    }

    public void d(com.google.firebase.messaging.y yVar, bb.e eVar) {
        x4 x4Var = new x4(eVar);
        TreeMap treeMap = (TreeMap) this.f13967a;
        for (Integer num : treeMap.keySet()) {
            b bVarClone = ((b) eVar.f2020d).clone();
            n nVarB = ((m) treeMap.get(num)).b(yVar, Collections.singletonList(x4Var));
            int iF = nVarB instanceof g ? rl.b.F(((g) nVarB).f13750b.doubleValue()) : -1;
            if (iF == 2 || iF == -1) {
                eVar.f2020d = bVarClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f13968b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n nVarB2 = ((m) treeMap2.get((Integer) it.next())).b(yVar, Collections.singletonList(x4Var));
            if (nVarB2 instanceof g) {
                rl.b.F(((g) nVarB2).f13750b.doubleValue());
            }
        }
    }

    public t(int i) {
        switch (i) {
            case 3:
                this.f13967a = new TreeMap();
                this.f13968b = new TreeMap();
                break;
            default:
                this.f13967a = new HashMap();
                this.f13968b = new s(6);
                s sVar = new s(0);
                w wVar = w.BITWISE_AND;
                ArrayList arrayList = sVar.f13950a;
                arrayList.add(wVar);
                arrayList.add(w.BITWISE_LEFT_SHIFT);
                arrayList.add(w.BITWISE_NOT);
                arrayList.add(w.BITWISE_OR);
                arrayList.add(w.BITWISE_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_XOR);
                b(sVar);
                s sVar2 = new s(1);
                w wVar2 = w.EQUALS;
                ArrayList arrayList2 = sVar2.f13950a;
                arrayList2.add(wVar2);
                arrayList2.add(w.GREATER_THAN);
                arrayList2.add(w.GREATER_THAN_EQUALS);
                arrayList2.add(w.IDENTITY_EQUALS);
                arrayList2.add(w.IDENTITY_NOT_EQUALS);
                arrayList2.add(w.LESS_THAN);
                arrayList2.add(w.LESS_THAN_EQUALS);
                arrayList2.add(w.NOT_EQUALS);
                b(sVar2);
                s sVar3 = new s(2);
                w wVar3 = w.APPLY;
                ArrayList arrayList3 = sVar3.f13950a;
                arrayList3.add(wVar3);
                arrayList3.add(w.BLOCK);
                arrayList3.add(w.BREAK);
                arrayList3.add(w.CASE);
                arrayList3.add(w.DEFAULT);
                arrayList3.add(w.CONTINUE);
                arrayList3.add(w.DEFINE_FUNCTION);
                arrayList3.add(w.FN);
                arrayList3.add(w.IF);
                arrayList3.add(w.QUOTE);
                arrayList3.add(w.RETURN);
                arrayList3.add(w.SWITCH);
                arrayList3.add(w.TERNARY);
                b(sVar3);
                s sVar4 = new s(3);
                w wVar4 = w.AND;
                ArrayList arrayList4 = sVar4.f13950a;
                arrayList4.add(wVar4);
                arrayList4.add(w.NOT);
                arrayList4.add(w.OR);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.FOR_IN;
                ArrayList arrayList5 = sVar5.f13950a;
                arrayList5.add(wVar5);
                arrayList5.add(w.FOR_IN_CONST);
                arrayList5.add(w.FOR_IN_LET);
                arrayList5.add(w.FOR_LET);
                arrayList5.add(w.FOR_OF);
                arrayList5.add(w.FOR_OF_CONST);
                arrayList5.add(w.FOR_OF_LET);
                arrayList5.add(w.WHILE);
                b(sVar5);
                s sVar6 = new s(5);
                w wVar6 = w.ADD;
                ArrayList arrayList6 = sVar6.f13950a;
                arrayList6.add(wVar6);
                arrayList6.add(w.DIVIDE);
                arrayList6.add(w.MODULUS);
                arrayList6.add(w.MULTIPLY);
                arrayList6.add(w.NEGATE);
                arrayList6.add(w.POST_DECREMENT);
                arrayList6.add(w.POST_INCREMENT);
                arrayList6.add(w.PRE_DECREMENT);
                arrayList6.add(w.PRE_INCREMENT);
                arrayList6.add(w.SUBTRACT);
                b(sVar6);
                s sVar7 = new s(7);
                w wVar7 = w.ASSIGN;
                ArrayList arrayList7 = sVar7.f13950a;
                arrayList7.add(wVar7);
                arrayList7.add(w.CONST);
                arrayList7.add(w.CREATE_ARRAY);
                arrayList7.add(w.CREATE_OBJECT);
                arrayList7.add(w.EXPRESSION_LIST);
                arrayList7.add(w.GET);
                arrayList7.add(w.GET_INDEX);
                arrayList7.add(w.GET_PROPERTY);
                arrayList7.add(w.NULL);
                arrayList7.add(w.SET_PROPERTY);
                arrayList7.add(w.TYPEOF);
                arrayList7.add(w.UNDEFINED);
                arrayList7.add(w.VAR);
                b(sVar7);
                break;
        }
    }
}
