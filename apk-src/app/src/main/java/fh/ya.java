package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ya implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19090a;

    public ya(sy syVar) {
        this.f19090a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xa deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        ParsingContext parsingContextCollectingErrors = ParsingContextKt.collectingErrors(parsingContext);
        sy syVar = this.f19090a;
        JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "functions", syVar.H3);
        JsonPropertyParser.readList(parsingContextCollectingErrors, jSONObject, "states", syVar.F2, za.f19209c);
        JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "timers", syVar.C8);
        JsonExpressionParser.readOptionalExpression(parsingContextCollectingErrors, jSONObject, "transition_animation_selector", za.f19208b, kr.J, za.f19207a);
        JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variables", syVar.f18341a9);
        ParsingContextKt.getCollectedErrors(parsingContextCollectingErrors);
        return new xa();
    }
}
