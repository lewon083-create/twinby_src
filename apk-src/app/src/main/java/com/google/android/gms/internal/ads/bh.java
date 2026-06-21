package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ou f3789f = ou.f8799b;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Object obj, Object obj2, int i, long j10, boolean z5) {
        ou ouVar = ou.f8799b;
        this.f3784a = obj;
        this.f3785b = obj2;
        this.f3786c = i;
        this.f3787d = j10;
        this.f3789f = ouVar;
        this.f3788e = z5;
    }

    public final long b(int i, int i10) {
        a aVarA = this.f3789f.a(i);
        if (aVarA.f2660a != -1) {
            return aVarA.f2664e[i10];
        }
        return -9223372036854775807L;
    }

    public final void c(int i) {
        this.f3789f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !bh.class.equals(obj.getClass())) {
            return false;
        }
        bh bhVar = (bh) obj;
        return Objects.equals(this.f3784a, bhVar.f3784a) && Objects.equals(this.f3785b, bhVar.f3785b) && this.f3786c == bhVar.f3786c && this.f3787d == bhVar.f3787d && this.f3788e == bhVar.f3788e && Objects.equals(this.f3789f, bhVar.f3789f);
    }

    public final int hashCode() {
        Object obj = this.f3784a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3785b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f3786c;
        long j10 = this.f3787d;
        return this.f3789f.hashCode() + (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.f3788e ? 1 : 0)) * 31);
    }
}
