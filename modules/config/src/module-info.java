module config {
  opens daggerok.config;
  exports daggerok.config;

  requires api;
  requires impl;
}
