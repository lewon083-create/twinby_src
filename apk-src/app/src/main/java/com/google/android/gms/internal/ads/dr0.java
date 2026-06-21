package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4634a = new HashMap();

    public final cr0 a(wq0 wq0Var, Context context, sq0 sq0Var, in0 in0Var) {
        xq0 xq0Var;
        HashMap map = this.f4634a;
        cr0 cr0Var = (cr0) map.get(wq0Var);
        if (cr0Var != null) {
            return cr0Var;
        }
        if (wq0Var == wq0.f11875b) {
            wk wkVar = al.f2970d7;
            yk ykVar = q9.s.f31967e.f31970c;
            int iIntValue = ((Integer) ykVar.a(wkVar)).intValue();
            int iIntValue2 = ((Integer) ykVar.a(al.f3062j7)).intValue();
            int iIntValue3 = ((Integer) ykVar.a(al.f3094l7)).intValue();
            String str = (String) ykVar.a(al.f3123n7);
            String str2 = (String) ykVar.a(al.f3001f7);
            xq0Var = new xq0(context, wq0Var, iIntValue, iIntValue2, iIntValue3, str, str2);
        } else if (wq0Var == wq0.f11876c) {
            wk wkVar2 = al.e7;
            yk ykVar2 = q9.s.f31967e.f31970c;
            int iIntValue4 = ((Integer) ykVar2.a(wkVar2)).intValue();
            int iIntValue5 = ((Integer) ykVar2.a(al.k7)).intValue();
            int iIntValue6 = ((Integer) ykVar2.a(al.f3109m7)).intValue();
            String str3 = (String) ykVar2.a(al.f3136o7);
            String str4 = (String) ykVar2.a(al.f3017g7);
            xq0Var = new xq0(context, wq0Var, iIntValue4, iIntValue5, iIntValue6, str3, str4);
        } else if (wq0Var == wq0.f11877d) {
            wk wkVar3 = al.f3181r7;
            yk ykVar3 = q9.s.f31967e.f31970c;
            int iIntValue7 = ((Integer) ykVar3.a(wkVar3)).intValue();
            int iIntValue8 = ((Integer) ykVar3.a(al.f3211t7)).intValue();
            int iIntValue9 = ((Integer) ykVar3.a(al.f3226u7)).intValue();
            String str5 = (String) ykVar3.a(al.f3151p7);
            String str6 = (String) ykVar3.a(al.f3166q7);
            xq0Var = new xq0(context, wq0Var, iIntValue7, iIntValue8, iIntValue9, str5, str6);
        } else {
            xq0Var = null;
        }
        oq0 oq0Var = new oq0(xq0Var);
        cr0 cr0Var2 = new cr0(oq0Var, new g(oq0Var, sq0Var, in0Var));
        map.put(wq0Var, cr0Var2);
        return cr0Var2;
    }
}
