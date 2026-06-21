package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f13286c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.auth.u0
    public final void a(long j10, Object obj) {
        Object objUnmodifiableList;
        List list = (List) w1.d(j10, obj);
        if (list instanceof r0) {
            objUnmodifiableList = ((r0) list).i();
        } else {
            if (f13286c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof g1) && (list instanceof m0)) {
                c0 c0Var = (c0) ((m0) list);
                boolean z5 = c0Var.f13175b;
                if (z5 && z5) {
                    c0Var.f13175b = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        w1.j(j10, obj, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.u0
    public final void b(long j10, Object obj, Object obj2) {
        List list;
        List list2;
        List list3 = (List) w1.d(j10, obj2);
        int size = list3.size();
        List list4 = (List) w1.d(j10, obj);
        if (list4.isEmpty()) {
            List q0Var = list4 instanceof r0 ? new q0(size) : ((list4 instanceof g1) && (list4 instanceof m0)) ? ((m0) list4).d(size) : new ArrayList(size);
            w1.j(j10, obj, q0Var);
            list2 = q0Var;
        } else {
            if (f13286c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                w1.j(j10, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof r1) {
                q0 q0Var2 = new q0(list4.size() + size);
                q0Var2.addAll(q0Var2.f13282c.size(), (r1) list4);
                w1.j(j10, obj, q0Var2);
                list = q0Var2;
            } else {
                boolean z5 = list4 instanceof g1;
                list2 = list4;
                if (z5) {
                    boolean z10 = list4 instanceof m0;
                    list2 = list4;
                    if (z10) {
                        m0 m0Var = (m0) list4;
                        list2 = list4;
                        if (!((c0) m0Var).f13175b) {
                            m0 m0VarD = m0Var.d(list4.size() + size);
                            w1.j(j10, obj, m0VarD);
                            list2 = m0VarD;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        w1.j(j10, obj, list3);
    }
}
