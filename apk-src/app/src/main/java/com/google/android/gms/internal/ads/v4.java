package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v4 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11230b;

    public v4(String str, String str2) {
        this.f11229a = ix.w(str);
        this.f11230b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.k8
    public final void a(w6 w6Var) {
        Integer numZ;
        Integer numZ2;
        Integer numZ3;
        Integer numZ4;
        String str = this.f11229a;
        int iHashCode = str.hashCode();
        String str2 = this.f11230b;
        switch (iHashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numZ = gr.Z(str2)) != null) {
                    w6Var.i = numZ;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numZ2 = gr.Z(str2)) != null) {
                    w6Var.f11675v = numZ2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numZ3 = gr.Z(str2)) != null) {
                    w6Var.f11662h = numZ3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    w6Var.f11657c = str2;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    w6Var.f11676w = str2;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    w6Var.f11655a = str2;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    w6Var.f11659e = str2;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numZ4 = gr.Z(str2)) != null) {
                    w6Var.f11674u = numZ4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    w6Var.f11658d = str2;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    w6Var.f11656b = str2;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v4.class == obj.getClass()) {
            v4 v4Var = (v4) obj;
            if (this.f11229a.equals(v4Var.f11229a) && this.f11230b.equals(v4Var.f11230b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11230b.hashCode() + ((this.f11229a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.f11229a;
        int length = String.valueOf(str).length();
        String str2 = this.f11230b;
        return om1.n(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
