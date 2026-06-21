package q3;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        long j10 = iVar.f31662g;
        long j11 = iVar2.f31662g;
        return j10 - j11 == 0 ? iVar.compareTo(iVar2) : j10 < j11 ? -1 : 1;
    }
}
