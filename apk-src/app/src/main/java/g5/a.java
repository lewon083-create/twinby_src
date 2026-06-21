package g5;

import java.util.Collections;
import java.util.List;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20001c;

    public a(int i, long j10, long j11) {
        this.f19999a = i;
        switch (i) {
            case 2:
                this.f20000b = j10;
                this.f20001c = j11;
                break;
            default:
                this.f20000b = j11;
                this.f20001c = j10;
                break;
        }
    }

    public static long d(long j10, p pVar) {
        long jZ = pVar.z();
        if ((128 & jZ) != 0) {
            return 8589934591L & ((((jZ & 1) << 32) | pVar.B()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // g5.b
    public final String toString() {
        switch (this.f19999a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f20000b);
                sb2.append(", identifier= ");
                return pe.a.h(sb2, this.f20001c, " }");
            case 1:
                StringBuilder sb3 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb3.append(this.f20000b);
                sb3.append(", programSplicePlaybackPositionUs= ");
                return pe.a.h(sb3, this.f20001c, " }");
            default:
                StringBuilder sb4 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb4.append(this.f20000b);
                sb4.append(", playbackPositionUs= ");
                return pe.a.h(sb4, this.f20001c, " }");
        }
    }

    public a(long j10, long j11, List list) {
        this.f19999a = 1;
        this.f20000b = j10;
        this.f20001c = j11;
        Collections.unmodifiableList(list);
    }
}
