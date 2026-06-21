package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x41 f9328c;

    public q4(String str, String str2, r51 r51Var) {
        super(str);
        ix.o(!r51Var.isEmpty());
        this.f9327b = str2;
        x41 x41VarV = x41.v(r51Var);
        this.f9328c = x41VarV;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, blocks: (B:69:0x0115, B:82:0x015f, B:84:0x0168, B:86:0x0174, B:102:0x01b8), top: B:113:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0173  */
    @Override // com.google.android.gms.internal.ads.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.w6 r8) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q4.a(com.google.android.gms.internal.ads.w6):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q4.class == obj.getClass()) {
            q4 q4Var = (q4) obj;
            if (Objects.equals(this.f7384a, q4Var.f7384a) && Objects.equals(this.f9327b, q4Var.f9327b) && this.f9328c.equals(q4Var.f9328c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7384a.hashCode() + 527;
        String str = this.f9327b;
        return this.f9328c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final String toString() {
        String strValueOf = String.valueOf(this.f9328c);
        String str = this.f7384a;
        int length = String.valueOf(str).length();
        String str2 = this.f9327b;
        StringBuilder sb2 = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        l7.o.t(sb2, str, ": description=", str2, ": values=");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
