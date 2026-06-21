package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t4 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18615a;

    public t4(sy syVar) {
        this.f18615a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nc.e deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING);
        sy syVar = this.f18615a;
        ij.p pVar = syVar.f18443k1;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", pVar);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", pVar);
        return new nc.e();
    }
}
