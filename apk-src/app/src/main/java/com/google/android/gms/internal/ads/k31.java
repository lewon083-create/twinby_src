package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k31 extends m31 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7105h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k31(CharSequence charSequence, Object obj, int i) {
        super(charSequence);
        this.f7104g = i;
        this.f7105h = obj;
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final int a(int i) {
        switch (this.f7104g) {
            case 0:
                CharSequence charSequence = this.f7759d;
                int length = charSequence.length();
                ix.o0(i, length);
                while (i < length) {
                    if (((b31) this.f7105h).b(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((pp0) this.f7105h).f9149c;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final int b(int i) {
        switch (this.f7104g) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((pp0) this.f7105h).f9149c).end();
        }
    }
}
