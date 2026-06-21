package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o8 implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18030a;

    public o8(sy syVar) {
        this.f18030a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q8 deserialize(ParsingContext parsingContext, q8 q8Var, JSONObject jSONObject) {
        return new q8(JsonFieldParser.readListField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "items", parsingContext.getAllowPropertyOverride(), q8Var != null ? q8Var.f18150a : null, this.f18030a.V1, j6.f17464e));
    }
}
