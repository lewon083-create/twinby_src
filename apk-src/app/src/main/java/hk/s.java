package hk;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f20705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj.n f20706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f20708e;

    public s(Object obj, i iVar, wj.n nVar, Object obj2, Throwable th2) {
        this.f20704a = obj;
        this.f20705b = iVar;
        this.f20706c = nVar;
        this.f20707d = obj2;
        this.f20708e = th2;
    }

    public static s a(s sVar, i iVar, CancellationException cancellationException, int i) {
        Object obj = sVar.f20704a;
        if ((i & 2) != 0) {
            iVar = sVar.f20705b;
        }
        i iVar2 = iVar;
        wj.n nVar = sVar.f20706c;
        Object obj2 = sVar.f20707d;
        Throwable th2 = cancellationException;
        if ((i & 16) != 0) {
            th2 = sVar.f20708e;
        }
        return new s(obj, iVar2, nVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f20704a, sVar.f20704a) && Intrinsics.a(this.f20705b, sVar.f20705b) && Intrinsics.a(this.f20706c, sVar.f20706c) && Intrinsics.a(this.f20707d, sVar.f20707d) && Intrinsics.a(this.f20708e, sVar.f20708e);
    }

    public final int hashCode() {
        Object obj = this.f20704a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f20705b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        wj.n nVar = this.f20706c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f20707d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f20708e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f20704a + ", cancelHandler=" + this.f20705b + ", onCancellation=" + this.f20706c + ", idempotentResume=" + this.f20707d + ", cancelCause=" + this.f20708e + ')';
    }

    public /* synthetic */ s(Object obj, i iVar, wj.n nVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : nVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
