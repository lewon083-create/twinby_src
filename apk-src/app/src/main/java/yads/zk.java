package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zk f45443e = new zk(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45447d;

    public zk(int i, int i10, int i11) {
        this.f45444a = i;
        this.f45445b = i10;
        this.f45446c = i11;
        this.f45447d = lb3.e(i11) ? lb3.b(i11, i10) : -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f45444a);
        sb2.append(", channelCount=");
        sb2.append(this.f45445b);
        sb2.append(", encoding=");
        return com.google.android.gms.internal.ads.om1.l(sb2, this.f45446c, ']');
    }
}
