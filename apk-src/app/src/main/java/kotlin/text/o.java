package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f27570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f27571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f27572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f27573d;

    public o(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f27570a = matcher;
        this.f27571b = input;
        this.f27572c = new n(this);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        if (this.f27573d == null) {
            this.f27573d = new l(this);
        }
        l lVar = this.f27573d;
        Intrinsics.b(lVar);
        return lVar;
    }

    public final IntRange b() {
        Matcher matcher = this.f27570a;
        return ck.o.e(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f27570a.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final o next() {
        Matcher matcher = this.f27570a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f27571b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new o(matcher2, charSequence);
        }
        return null;
    }
}
