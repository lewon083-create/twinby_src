package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yz implements o00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ni f12802c;

    public /* synthetic */ yz(ni niVar, int i) {
        this.f12801b = i;
        this.f12802c = niVar;
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void b(int i, String str, String str2, boolean z5) {
        switch (this.f12801b) {
            case 0:
                this.f12802c.e();
                break;
            default:
                ni niVar = this.f12802c;
                if (!z5) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb2 = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Image Web View failed to load. Error code: ");
                    sb2.append(i);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    niVar.d(new rj0(1, a0.u.o(sb2, ", Failing URL: ", str2)));
                } else {
                    niVar.e();
                }
                break;
        }
    }
}
