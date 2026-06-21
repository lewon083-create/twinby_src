package yads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42630d;

    public rl2(String str, long j10, long j11) {
        this.f42629c = str == null ? "" : str;
        this.f42627a = j10;
        this.f42628b = j11;
    }

    public final rl2 a(rl2 rl2Var, String str) {
        String strA = ra3.a(str, this.f42629c);
        if (rl2Var == null || !strA.equals(ra3.a(str, rl2Var.f42629c))) {
            return null;
        }
        long j10 = this.f42628b;
        if (j10 != -1) {
            long j11 = this.f42627a;
            if (j11 + j10 == rl2Var.f42627a) {
                long j12 = rl2Var.f42628b;
                return new rl2(strA, j11, j12 != -1 ? j10 + j12 : -1L);
            }
        }
        long j13 = rl2Var.f42628b;
        if (j13 == -1) {
            return null;
        }
        long j14 = rl2Var.f42627a;
        if (j14 + j13 == this.f42627a) {
            return new rl2(strA, j14, j10 != -1 ? j13 + j10 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rl2.class == obj.getClass()) {
            rl2 rl2Var = (rl2) obj;
            if (this.f42627a == rl2Var.f42627a && this.f42628b == rl2Var.f42628b && this.f42629c.equals(rl2Var.f42629c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f42630d == 0) {
            this.f42630d = this.f42629c.hashCode() + ((((((int) this.f42627a) + 527) * 31) + ((int) this.f42628b)) * 31);
        }
        return this.f42630d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f42629c);
        sb2.append(", start=");
        sb2.append(this.f42627a);
        sb2.append(", length=");
        return pe.a.h(sb2, this.f42628b, ")");
    }

    public final Uri a(String str) {
        return Uri.parse(ra3.a(str, this.f42629c));
    }
}
