package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q2 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18142a;

    public q2(sy syVar) {
        this.f18142a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g8.g deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        ij.p pVar = this.f18142a.f18443k1;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", pVar);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", pVar);
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        return new g8.g(23);
    }
}
