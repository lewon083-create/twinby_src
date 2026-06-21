package l4;

import ad.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27860c;

    public h(j3.o oVar, int i) {
        this.f27859b = (oVar.f26327e & 1) != 0;
        this.f27860c = s3.a.l(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return z.f896a.c(this.f27860c, hVar.f27860c).c(this.f27859b, hVar.f27859b).e();
    }
}
