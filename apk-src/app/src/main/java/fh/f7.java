package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f7 implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17180a;

    public f7(sy syVar) {
        this.f17180a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h7 deserialize(ParsingContext parsingContext, h7 h7Var, JSONObject jSONObject) {
        return new h7(JsonFieldParser.readListField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "items", parsingContext.getAllowPropertyOverride(), h7Var != null ? h7Var.f17329a : null, this.f17180a.A1, j6.f17461b));
    }
}
