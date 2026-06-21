package v;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f34620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34623d = 1;

    public i(OutputConfiguration outputConfiguration) {
        this.f34620a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f34620a.equals(iVar.f34620a) && this.f34622c == iVar.f34622c && this.f34623d == iVar.f34623d && Objects.equals(this.f34621b, iVar.f34621b);
    }

    public final int hashCode() {
        int iHashCode = this.f34620a.hashCode() ^ 31;
        int i = (this.f34622c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i10 = (i << 5) - i;
        String str = this.f34621b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
        return Long.hashCode(this.f34623d) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
