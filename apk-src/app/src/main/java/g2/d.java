package g2;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19845b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ClipData f19846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f19849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f19850g;

    public /* synthetic */ d() {
    }

    @Override // g2.e
    public ClipData a() {
        return this.f19846c;
    }

    @Override // g2.c
    public f build() {
        return new f(new d(this));
    }

    @Override // g2.c
    public void d(Uri uri) {
        this.f19849f = uri;
    }

    @Override // g2.e
    public int e() {
        return this.f19848e;
    }

    @Override // g2.e
    public ContentInfo f() {
        return null;
    }

    @Override // g2.e
    public int g() {
        return this.f19847d;
    }

    @Override // g2.c
    public void i(int i) {
        this.f19848e = i;
    }

    @Override // g2.c
    public void setExtras(Bundle bundle) {
        this.f19850g = bundle;
    }

    public String toString() {
        String str;
        switch (this.f19845b) {
            case 1:
                Uri uri = this.f19849f;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f19846c.getDescription());
                sb2.append(", source=");
                int i = this.f19847d;
                sb2.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i10 = this.f19848e;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return a0.u.o(sb2, this.f19850g != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public d(d dVar) {
        ClipData clipData = dVar.f19846c;
        clipData.getClass();
        this.f19846c = clipData;
        int i = dVar.f19847d;
        f2.g.e("source", i, 0, 5);
        this.f19847d = i;
        int i10 = dVar.f19848e;
        if ((i10 & 1) == i10) {
            this.f19848e = i10;
            this.f19849f = dVar.f19849f;
            this.f19850g = dVar.f19850g;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
