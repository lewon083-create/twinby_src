package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13680b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13681a;

    public c0(int i) {
        this.f13681a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        int i = ((c0) obj).f13681a;
        int i10 = this.f13681a;
        if (i10 != 0) {
            return i10 == i;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f13681a;
        if (i != 0) {
            return ((i ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.f13681a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        StringBuilder sb2 = new StringBuilder("READ_AND_WRITE".length() + pe.a.b("".length() + 73, 91, str) + 1);
        l7.o.t(sb2, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb2.append("}");
        return sb2.toString();
    }
}
