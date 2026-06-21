package kk;

import com.google.android.gms.internal.ads.en1;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends en1 implements p, e, lk.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27463f = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27464e;

    public t(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean E(Object obj, Object obj2) {
        d8.k kVar = lk.g.f28140a;
        if (obj == null) {
            obj = kVar;
        }
        if (obj2 == null) {
            obj2 = kVar;
        }
        return H(obj, obj2);
    }

    public final Object F() {
        Object obj = f27463f.get(this);
        if (obj == lk.g.f28140a) {
            return null;
        }
        return obj;
    }

    public final void G(Object obj) {
        if (obj == null) {
            obj = lk.g.f28140a;
        }
        H(null, obj);
    }

    public final boolean H(Object obj, Object obj2) {
        int i;
        v[] vVarArr;
        d8.k kVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27463f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f27464e;
            if ((i10 & 1) != 0) {
                this.f27464e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f27464e = i11;
            v[] vVarArr2 = (v[]) this.f5015d;
            Unit unit = Unit.f27471a;
            while (true) {
                if (vVarArr2 != null) {
                    for (v vVar : vVarArr2) {
                        if (vVar != null) {
                            AtomicReference atomicReference = vVar.f27467a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (kVar = u.f27466b)) {
                                    d8.k kVar2 = u.f27465a;
                                    if (obj4 != kVar2) {
                                        while (!atomicReference.compareAndSet(obj4, kVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ij.k kVar3 = ij.m.f21341c;
                                        ((hk.l) obj4).resumeWith(Unit.f27471a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, kVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f27464e;
                    if (i == i11) {
                        this.f27464e = i11 + 1;
                        return true;
                    }
                    vVarArr = (v[]) this.f5015d;
                    Unit unit2 = Unit.f27471a;
                }
                vVarArr2 = vVarArr;
                i11 = i;
            }
        }
    }

    @Override // kk.f
    public final Object emit(Object obj, mj.a aVar) {
        G(obj);
        return Unit.f27471a;
    }

    @Override // lk.e
    public final e j(CoroutineContext coroutineContext, int i, jk.a aVar) {
        return u.d(this, coroutineContext, i, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dd, code lost:
    
        if (r12.equals(r13) == false) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:58:0x00d9, B:60:0x00df], limit reached: 87 */
    /* JADX WARN: Path cross not found for [B:60:0x00df, B:58:0x00d9], limit reached: 87 */
    /* JADX WARN: Path cross not found for [B:60:0x00df, B:68:0x00fa], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:50:0x00c1, B:52:0x00c9, B:55:0x00d0, B:56:0x00d6, B:58:0x00d9, B:68:0x00fa, B:71:0x010a, B:60:0x00df, B:64:0x00e6, B:21:0x004f, B:24:0x005a, B:49:0x00b2), top: B:89:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:50:0x00c1, B:52:0x00c9, B:55:0x00d0, B:56:0x00d6, B:58:0x00d9, B:68:0x00fa, B:71:0x010a, B:60:0x00df, B:64:0x00e6, B:21:0x004f, B:24:0x005a, B:49:0x00b2), top: B:89:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:50:0x00c1, B:52:0x00c9, B:55:0x00d0, B:56:0x00d6, B:58:0x00d9, B:68:0x00fa, B:71:0x010a, B:60:0x00df, B:64:0x00e6, B:21:0x004f, B:24:0x005a, B:49:0x00b2), top: B:89:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kk.v] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0109 -> B:50:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x011a -> B:50:0x00c1). Please report as a decompilation issue!!! */
    @Override // kk.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(kk.f r12, mj.a r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.t.p(kk.f, mj.a):java.lang.Object");
    }
}
