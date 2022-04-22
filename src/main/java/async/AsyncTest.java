package async;

import io.vavr.collection.List;
import io.vavr.*;
import io.vavr.control.Option;

import java.util.concurrent.CompletableFuture;

/**
 * You should complete the function in this class
 */
class AsyncTest {

  private static List<Enterprise> enterprises = List.of(
      new Enterprise("ent_1", "Google", "ceo_2"),
      new Enterprise("ent_2", "Facebook", "ceo_1")
  );

  private static List<Ceo> ceos = List.of(
      new Ceo("ceo_1", "Mark"),
      new Ceo("ceo_2", "Sundar"),
      new Ceo("ceo_3", "Bill")
  );

  public static CompletableFuture<Option<Ceo>> getCeoById(String ceo_id)
  {
    CompletableFuture<Option<Ceo>> foundCeo=CompletableFuture.supplyAsync(()->{
      Option<Ceo> Nceo;
      for (Ceo c:ceos) {
        if (c.id.equals(ceo_id)) Nceo=Option.of(c);
      }
      Nceo=null;
      return Nceo;
    });
    return foundCeo;
  }

  public static CompletableFuture<Option<Enterprise>> getEnterpriseByCeoId(String ceo_id)
  {
    CompletableFuture<Option<Enterprise>> foundEnterp=CompletableFuture.supplyAsync(()->{
      Option<Enterprise> Nenterp;
      for (Enterprise e:enterprises) {
        if (e.ceo_id.equals(ceo_id)) Nenterp=Option.of(e);
      }
      Nenterp=null;
      return Nenterp;
    });
    return foundEnterp;
  }

  public static CompletableFuture<Tuple2<Option<Ceo>, Option<Enterprise>>> getCEOAndEnterprise(String ceo_id)
  {
    CompletableFuture<Tuple2<Option<Ceo>,Option<Enterprise>>> foundEnC=CompletableFuture.supplyAsync(()->{
      Option<Ceo> Nceo;
      Option<Enterprise> Nenterp;
      for (Ceo c:ceos) {
        if (c.id.equals(ceo_id)) Nceo=Option.of(c);
      }
      Nceo=null;
      for (Enterprise e:enterprises) {
        if (e.ceo_id.equals(ceo_id)) Nenterp=Option.of(e);
      }
      Nenterp=null;
      Tuple2<Option<Ceo>,Option<Enterprise>> tuple2EnC=new Tuple2<>(Nceo,Nenterp);
      return tuple2EnC;
    });
    return foundEnC;
  }

}
