package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fi implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17216a;

    public fi(sy syVar) {
        this.f17216a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        ij.p pVar = this.f17216a.Q6;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17473o);
        return new zf();
    }
}
