package u3;

import ad.b1;
import ad.g0;
import ad.g1;
import ad.j0;
import ad.m0;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34071c = new b(j0.w(a.f34067d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1 f34072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g1 f34073e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f34074a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34075b;

    static {
        Object[] objArr = {2, 5, 6};
        ad.q.b(3, objArr);
        f34072d = j0.p(3, objArr);
        m0 m0Var = new m0(4, 0);
        m0Var.n(5, 6);
        m0Var.n(17, 6);
        m0Var.n(7, 6);
        m0Var.n(30, 10);
        m0Var.n(18, 6);
        m0Var.n(6, 8);
        m0Var.n(8, 8);
        m0Var.n(14, 8);
        f34073e = m0Var.d(true);
    }

    public b(b1 b1Var) {
        for (int i = 0; i < b1Var.f770e; i++) {
            a aVar = (a) b1Var.get(i);
            this.f34074a.put(aVar.f34068a, aVar);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.f34074a.size(); i10++) {
            iMax = Math.max(iMax, ((a) this.f34074a.valueAt(i10)).f34069b);
        }
        this.f34075b = iMax;
    }

    public static b1 a(int i, int[] iArr) {
        g0 g0VarQ = j0.q();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            g0VarQ.b(new a(i10, i));
        }
        return g0VarQ.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u3.b b(android.content.Context r12, android.content.Intent r13, j3.d r14, android.media.AudioDeviceInfo r15) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.b.b(android.content.Context, android.content.Intent, j3.d, android.media.AudioDeviceInfo):u3.b");
    }

    public static b c(Context context, j3.d dVar, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(j3.o r17, j3.d r18) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.b.d(j3.o, j3.d):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                SparseArray sparseArray = bVar.f34074a;
                String str = m3.z.f28608a;
                SparseArray sparseArray2 = this.f34074a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            zContentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i = 0; i < size; i++) {
                                    if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.f34075b != bVar.f34075b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        String str = m3.z.f28608a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f34074a;
        if (i >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.f34075b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f34075b + ", audioProfiles=" + this.f34074a + "]";
    }
}
