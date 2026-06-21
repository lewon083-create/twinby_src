package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.firebase.messaging.y f13876f;

    public m(m mVar) {
        super(mVar.f13768b);
        ArrayList arrayList = new ArrayList(mVar.f13874d.size());
        this.f13874d = arrayList;
        arrayList.addAll(mVar.f13874d);
        ArrayList arrayList2 = new ArrayList(mVar.f13875e.size());
        this.f13875e = arrayList2;
        arrayList2.addAll(mVar.f13875e);
        this.f13876f = mVar.f13876f;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n B() {
        return new m(this);
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n b(com.google.firebase.messaging.y yVar, List list) {
        r rVar;
        com.google.firebase.messaging.y yVarC = this.f13876f.C();
        t tVar = (t) yVarC.f14900c;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13874d;
            int size = arrayList.size();
            rVar = n.B1;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                yVarC.F((String) arrayList.get(i), ((t) yVar.f14900c).c(yVar, (n) list.get(i)));
            } else {
                yVarC.F((String) arrayList.get(i), rVar);
            }
            i++;
        }
        for (n nVar : this.f13875e) {
            n nVarC = tVar.c(yVarC, nVar);
            if (nVarC instanceof o) {
                nVarC = tVar.c(yVarC, nVar);
            }
            if (nVarC instanceof f) {
                return ((f) nVarC).f13722b;
            }
        }
        return rVar;
    }

    public m(String str, ArrayList arrayList, List list, com.google.firebase.messaging.y yVar) {
        super(str);
        this.f13874d = new ArrayList();
        this.f13876f = yVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f13874d.add(((n) it.next()).l());
            }
        }
        this.f13875e = new ArrayList(list);
    }
}
