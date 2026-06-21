package io.flutter.plugin.editing;

import a0.b1;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements SpellCheckerSession.SpellCheckerSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f25649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextServicesManager f25650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f25651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hi.g f25652d;

    public g(TextServicesManager textServicesManager, b1 b1Var) {
        this.f25650b = textServicesManager;
        this.f25649a = b1Var;
        b1Var.f45c = this;
    }

    public final void a(String str, String str2, hi.g gVar) {
        if (this.f25652d != null) {
            gVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f25652d = gVar;
        Locale localeA = ji.a.a(str);
        if (this.f25651c == null) {
            this.f25651c = this.f25650b.newSpellCheckerSession(null, localeA, this, true);
        }
        this.f25651c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f25652d.success(new ArrayList());
            this.f25652d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f25652d.success(new ArrayList());
            this.f25652d = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap map = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                map.put("startIndex", Integer.valueOf(offsetAt));
                map.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = false;
                for (int i10 = 0; i10 < suggestionsCount; i10++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i10);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z5 = true;
                    }
                }
                if (z5) {
                    map.put("suggestions", arrayList2);
                    arrayList.add(map);
                }
            }
        }
        this.f25652d.success(arrayList);
        this.f25652d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
