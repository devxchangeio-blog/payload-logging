image::https://travis-ci.org/karthy86/payload-logging.svg?branch=master[Build Status]

## payload-logging

Payload Logging Framework provides simplified configuration to log payload for spring project.

## Dependencies

```
compile ("io.oneclicklabs.logging:payload-logging:0.0.1-SNAPSHOT")
	
```

## Usage

### Enable payload-logging

```
payload.logger.enabled=true

```

### Injecting the LogWriterManager & adding Interceptors

```
@Configuration
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter 
{
	@Autowired
	@Qualifier("manager.logwriter")
	private LogWriterManager logWriterManager;

	@Override
	public void addInterceptors(InterceptorRegistry registry) 
	{
		registry.addInterceptor(new RestTransactionInterceptor(logWriterManager));
	}
}
	
```

## Release History

** 0.0.1-SNAPSHOT
    * logging rest verb & payload to console.

## Meta
Karthikeyan Sadayamuthu – [LinkedIn](https://www.linkedin.com/in/karthy86/)

Distributed under the Apache License. See ``LICENSE`` for more information.
[license](https://github.com/karthy86/payload-logging/blob/master/LICENSE)

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

