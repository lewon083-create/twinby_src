package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends u0 {
    @Override // com.google.android.gms.internal.auth.u0
    public final void a(long j10, Object obj) {
        c0 c0Var = (c0) ((m0) w1.d(j10, obj));
        if (c0Var.f13175b) {
            c0Var.f13175b = false;
        }
    }

    @Override // com.google.android.gms.internal.auth.u0
    public final void b(long j10, Object obj, Object obj2) {
        m0 m0VarD = (m0) w1.d(j10, obj);
        m0 m0Var = (m0) w1.d(j10, obj2);
        int size = m0VarD.size();
        int size2 = m0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((c0) m0VarD).f13175b) {
                m0VarD = m0VarD.d(size2 + size);
            }
            m0VarD.addAll(m0Var);
        }
        if (size > 0) {
            m0Var = m0VarD;
        }
        w1.j(j10, obj, m0Var);
    }
}
