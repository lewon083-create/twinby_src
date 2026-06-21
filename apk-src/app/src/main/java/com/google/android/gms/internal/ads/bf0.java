package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se0 f3769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd0 f3770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3771c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3772d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3773e;

    public bf0(se0 se0Var, fd0 fd0Var) {
        this.f3769a = se0Var;
        this.f3770b = fd0Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f3771c) {
            try {
                if (!this.f3773e) {
                    se0 se0Var = this.f3769a;
                    if (!se0Var.f10268b) {
                        ye0 ye0Var = new ye0(0, this);
                        se0 se0Var2 = this.f3769a;
                        se0Var2.getClass();
                        se0Var2.f10271e.f6961b.a(new l81(27, se0Var2, ye0Var), se0Var2.f10275j);
                        return jSONArray;
                    }
                    b(se0Var.b());
                }
                Iterator it = this.f3772d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((ze0) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(List list) {
        ts tsVar;
        ed0 ed0VarB;
        ed0 ed0VarB2;
        ts tsVar2;
        synchronized (this.f3771c) {
            try {
                if (this.f3773e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pp ppVar = (pp) it.next();
                    wk wkVar = al.Ba;
                    q9.s sVar = q9.s.f31967e;
                    String string = (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() || (ed0VarB2 = this.f3770b.b(ppVar.f9144b)) == null || (tsVar2 = ed0VarB2.f4922c) == null) ? "" : tsVar2.toString();
                    String str = string;
                    boolean z5 = ((Boolean) sVar.f31970c.a(al.Ca)).booleanValue() && (ed0VarB = this.f3770b.b(ppVar.f9144b)) != null && ed0VarB.f4923d;
                    ArrayList arrayList = this.f3772d;
                    String str2 = ppVar.f9144b;
                    ed0 ed0VarB3 = this.f3770b.b(str2);
                    arrayList.add(new ze0(str2, str, (ed0VarB3 == null || (tsVar = ed0VarB3.f4921b) == null) ? "" : tsVar.toString(), ppVar.f9145c ? 1 : 0, ppVar.f9147e, ppVar.f9146d, z5));
                }
                this.f3773e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
