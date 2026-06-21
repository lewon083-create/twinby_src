package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements a7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f7376b;

    public l2(int i) {
        switch (i) {
            case 1:
                this.f7376b = new tk0();
                break;
            default:
                this.f7376b = new tk0(10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.f9 a(com.google.android.gms.internal.ads.a2 r18, com.google.android.gms.internal.ads.c6 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l2.a(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.c6, int):com.google.android.gms.internal.ads.f9");
    }

    @Override // com.google.android.gms.internal.ads.a7
    public void c(int i, int i10, a4.g gVar, byte[] bArr) {
        z40 z40VarA;
        tk0 tk0Var = this.f7376b;
        tk0Var.z(i + i10, bArr);
        tk0Var.E(i);
        ArrayList arrayList = new ArrayList();
        while (tk0Var.B() > 0) {
            ix.A("Incomplete Mp4Webvtt Top Level box header found.", tk0Var.B() >= 8);
            int iB = tk0Var.b() - 8;
            if (tk0Var.b() == 1987343459) {
                CharSequence charSequenceA = null;
                n40 n40VarB = null;
                while (iB > 0) {
                    ix.A("Incomplete vtt cue box header found.", iB >= 8);
                    int iB2 = tk0Var.b();
                    int iB3 = tk0Var.b();
                    int i11 = iB - 8;
                    int i12 = iB2 - 8;
                    byte[] bArr2 = tk0Var.f10641a;
                    int i13 = tk0Var.f10642b;
                    String str = cq0.f4293a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    tk0Var.G(i12);
                    if (iB3 == 1937011815) {
                        i8 i8Var = new i8();
                        j8.c(str2, i8Var);
                        n40VarB = i8Var.b();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = j8.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    iB = i11 - i12;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (n40VarB != null) {
                    n40VarB.f8178a = charSequenceA;
                    n40VarB.f8179b = null;
                    z40VarA = n40VarB.a();
                } else {
                    Pattern pattern = j8.f6751a;
                    i8 i8Var2 = new i8();
                    i8Var2.f6415c = charSequenceA;
                    z40VarA = i8Var2.b().a();
                }
                arrayList.add(z40VarA);
            } else {
                tk0Var.G(iB);
            }
        }
        gVar.mo0a(new v6(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
